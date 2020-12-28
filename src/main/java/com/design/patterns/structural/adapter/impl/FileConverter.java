package com.design.patterns.structural.adapter.impl;

import com.design.patterns.structural.adapter.FileTypeConverter;
import com.design.patterns.structural.adapter.enums.FileType;

import java.io.File;

public class FileConverter implements FileTypeConverter {

    private FileConverterAdapter adapter;

    public FileConverter(FileConverterAdapter adapter) {
        this.adapter = adapter;
    }

    public void convert(File file, FileType type) {
        if (type.equals(FileType.PDF))
            System.out.println("File converted to: PDF");
        else if (type.equals(FileType.DOCX))
            adapter.convert(file, type);
        else
            System.out.println("File type [" + type.name() + "] not suported.");
    }

}
