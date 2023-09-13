package org.example.Builder;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Computer {
    private String operatingSystem;
    private String motherBoard;
    private int ram;
    private String cpu;
    private int storage;
}
