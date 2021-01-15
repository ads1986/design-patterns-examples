package com.design.patterns;

import com.design.patterns.creational.abstractFactory.FactoryTaxes;
import com.design.patterns.creational.abstractFactory.factory.FactoryBusinessTax;
import com.design.patterns.creational.abstractFactory.factory.FactoryIndividualTax;
import com.design.patterns.creational.abstractFactory.model.BusinessSaleTax;
import com.design.patterns.creational.factory.FactoryPropertyTax;
import com.design.patterns.creational.factory.FactorySaleTax;
import com.design.patterns.creational.factory.FactoryTax;
import com.design.patterns.creational.factory.Fee;
import com.design.patterns.creational.prototype.Car;
import com.design.patterns.creational.prototype.Motorcycle;
import com.design.patterns.creational.singleton.SingletonUserSession;
import com.design.patterns.structural.adapter.FileTypeConverter;
import com.design.patterns.structural.adapter.impl.FileConverter;
import com.design.patterns.structural.adapter.enums.FileType;
import com.design.patterns.structural.adapter.impl.FileConverterAdapter;
import com.design.patterns.structural.bridge.*;
import com.design.patterns.structural.composite.PointOfSale;
import com.design.patterns.structural.decorator.Account;
import com.design.patterns.structural.decorator.CheckingAccount;
import com.design.patterns.structural.decorator.PlatinumCheckingAccount;
import com.design.patterns.structural.facade.CalculusFacadeImpl;
import com.design.patterns.structural.facade.CalculusService;
import com.design.patterns.structural.flightweight.Address;
import com.design.patterns.structural.flightweight.PlaceOrder;
import com.design.patterns.structural.flightweight.Product;
import com.design.patterns.structural.proxy.ProxyUserServiceImpl;
import com.design.patterns.structural.proxy.User;
import com.design.patterns.structural.proxy.UserService;

import java.io.File;
import java.util.List;

import static java.util.Collections.singletonList;

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

        System.out.println("");

        System.out.println("Structural -> Bridge");

        Company company1 = new SmallSizeCompany("Doug Book Store", new SmallPartnershipTax());
        System.out.println("Name :" + company1.getName());
        System.out.println("Liquid Assets : " + company1.getLiquidAssets(200.000));

        Company company2 = new MicroSizeCompany("Trisha Auto Parts", new SmallPartnershipTax());
        System.out.println("Name :" + company2.getName());
        System.out.println("Liquid Assets : " + company2.getLiquidAssets(40.000));

        Company company3 = new MidSizeCompany("Target Mall", new SmallCorporationTax());
        System.out.println("Name :" + company3.getName());
        System.out.println("Liquid Assets : " + company3.getLiquidAssets(1000.000));

        System.out.println("");

        System.out.println("Structural -> Composite");
        PointOfSale pointOfSale = new PointOfSale();
        System.out.println("Total : " + pointOfSale.getTotalPrice().getPrice());

        System.out.println("");

        System.out.println("Structural -> FlightWeight");
        PlaceOrder placeOrder = new PlaceOrder();
        placeOrder.placeOrder(singletonList(new Product()), "mainStorage", new Address("customer", "Leonard Avenue", "32"));
        placeOrder.placeOrder(singletonList(new Product()), "mainStorage", new Address("customer", "Richard Avenue", "3000"));
        placeOrder.placeOrder(singletonList(new Product()), "store2", new Address("customer", "Golf Avenue", "100"));

        System.out.println("");

        System.out.println("Creational -> Factory Method");
        FactoryTax saleTax = new FactorySaleTax();
        System.out.println("Sale Tax (3% rate) : $ " + saleTax.createTax().calculate(100));
        FactoryTax propertyTax = new FactoryPropertyTax();
        System.out.println("Property Tax (10% rate) : $ " + propertyTax.createTax().calculate(100));

        System.out.println("");

        System.out.println("Creational -> Abstract Factory");
        FactoryTaxes factoryBusiness = new FactoryBusinessTax();
        System.out.println("Business -> Sale Tax (5% rate) : $ " + factoryBusiness.createProportionalTax().calculate(100));
        System.out.println("Business -> Property Tax (20% rate) : $ " + factoryBusiness.createRegressiveTax().calculate(100));

        FactoryTaxes factoryIndividualTax = new FactoryIndividualTax();
        System.out.println("Individual -> Sale Tax (1% rate) : $ " + factoryIndividualTax.createProportionalTax().calculate(100));
        System.out.println("Individual -> Property Tax (10% rate) : $ " + factoryIndividualTax.createRegressiveTax().calculate(100));

        System.out.println("");

        System.out.println("Creational -> Singleton");

        SingletonUserSession session = SingletonUserSession.getInstance();

        System.out.println("Set name and age ->");
        session.setName("George");
        session.setAge(20);
        System.out.println("Name: " + session.getName() + " Age: " + session.getAge());

        SingletonUserSession session2 = SingletonUserSession.getInstance();
        System.out.println("Name: " + session2.getName() + " Age: " + session2.getAge());

        System.out.println("Update name and age ->");
        session.setName("George Ford");
        session.setAge(21);

        System.out.println("Name: " + session.getName() + " Age: " + session.getAge());
        System.out.println("Name: " + session2.getName() + " Age: " + session2.getAge());

        System.out.println("");

        System.out.println("Creational -> Prototype");

        Car car = new Car("Mustange", "Ford", 100.000);
        System.out.println("Car -> Original - (" + car + ") Name: " + car.getName() + " Brand: " + car.getBrand() + "Price: " + car.getPrice());

        Car carClone = car.clone();
        System.out.println("Car -> Clone - (" + carClone + ") Name: " + carClone.getName() + " Brand: " + carClone.getBrand() + "Price: " + carClone.getPrice());

        Motorcycle motorcycle = new Motorcycle("CBR600", "Honda", 10.000);
        System.out.println("Motorcycle -> Original - (" + car + ") Name: " + car.getName() + " Brand: " + car.getBrand() + "Price: " + car.getPrice());

        Motorcycle motorcycleClone = motorcycle.clone();
        System.out.println("Motorcycle -> Clone - (" + motorcycleClone + ") Name: " + motorcycleClone.getName() + " Brand: " + motorcycleClone.getBrand() + "Price: " + motorcycleClone.getPrice());
    }

}