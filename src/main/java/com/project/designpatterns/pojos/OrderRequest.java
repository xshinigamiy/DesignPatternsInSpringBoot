package com.project.designpatterns.pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private String firstName;
    private String lastName;
    private String orderType;
}
