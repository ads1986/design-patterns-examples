package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.enums.FileType;

import java.io.File;

public interface FileTypeConverter {
    void convert(File file, FileType type);
}
