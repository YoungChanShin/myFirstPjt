package org.example.myFirstPjt.web.dto;

import lombok.*;

@Getter
@AllArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
