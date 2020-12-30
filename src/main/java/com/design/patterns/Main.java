package com.design.patterns;

import com.design.patterns.structural.adapter.FileTypeConverter;
import com.design.patterns.structural.adapter.impl.FileConverter;
import com.design.patterns.structural.adapter.enums.FileType;
import com.design.patterns.structural.adapter.impl.FileConverterAdapter;
import com.design.patterns.structural.decorator.Account;
import com.design.patterns.structural.decorator.CheckingAccount;
import com.design.patterns.structural.decorator.PlatinumCheckingAccount;
import com.design.patterns.structural.facade.CalculusFacadeImpl;
import com.design.patterns.structural.facade.CalculusService;
import com.design.patterns.structural.proxy.ProxyUserServiceImpl;
import com.design.patterns.structural.proxy.User;
import com.design.patterns.structural.proxy.UserService;

import java.io.File;
import java.util.List;

/**
    Design Patterns Examples

 */
public class Main {

    public static void main(String args[]){
        System.out.println("Structural -> Facade");
        CalculusService calculusService = new CalculusService(new CalculusFacadeImpl());
        System.out.println("Triangle Area : " + calculusService.calculateTriangleArea("3", "10"));

        System.out.println("");

        System.out.println("Structural -> Proxy");
        UserService proxy = new ProxyUserServiceImpl();
        List<User> users = proxy.list();
        System.out.println(users);

        System.out.println("");

        System.out.println("Structural -> Adapter");
        FileTypeConverter convert = new FileConverter(new FileConverterAdapter(FileType.DOCX));
        File file = new File("fileToConvert.txt");
        convert.convert(file, FileType.PDF);
        convert.convert(file, FileType.JPG);
        convert.convert(file, FileType.DOCX);

        System.out.println("");

        System.out.println("Structural -> Decorator");
        Account account = new CheckingAccount();
        account.addMoney(1000);
        System.out.println("Total Balance - Checking Account = R$ " + account.getTotalBalance());
        account = new PlatinumCheckingAccount(account);
        System.out.println("Total Balance - Platinum Checking Account (Overdraft + " + account.getOverdraft() + ") R$ " + account.getTotalBalance());
    }

}
