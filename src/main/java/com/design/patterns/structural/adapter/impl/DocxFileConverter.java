package com.design.patterns.structural.adapter.impl;

import com.design.patterns.structural.adapter.DocxFileTypeConverter;

import java.io.File;

public class DocxFileConverter implements DocxFileTypeConverter {

    @Override
    public void convertToDocx(File file) {
        System.out.println("File converted to: DOCX");
    }

}
