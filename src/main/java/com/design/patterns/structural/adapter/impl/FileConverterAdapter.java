package com.design.patterns.structural.adapter.impl;

import com.design.patterns.structural.adapter.FileTypeConverter;
import com.design.patterns.structural.adapter.DocxFileTypeConverter;
import com.design.patterns.structural.adapter.enums.FileType;

import java.io.File;

public class FileConverterAdapter implements FileTypeConverter {

    private DocxFileTypeConverter docxConverter;

    public FileConverterAdapter(FileType type) {
        if (FileType.DOCX.equals(type))
            this.docxConverter = new DocxFileConverter();
    }

    @Override
    public void convert(File file, FileType type) {
        System.out.println("Converting using Adapter -->");
        if (FileType.DOCX.equals(type))
            this.docxConverter.convertToDocx(file);
    }
}
