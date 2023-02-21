package net.stntwk.springmvcmodelsample;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Map;

@Data
public class MainForm{
    private String name;
    private int age;
    private String gender;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthday;
    private String favoriteColor;
    private String favoriteFruit;
}
