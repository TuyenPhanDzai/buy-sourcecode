package org.example.buysourcecode.dto.Category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UpdateCategoryRequest {
    private String id;
    private String name;
    private String slug;
}
