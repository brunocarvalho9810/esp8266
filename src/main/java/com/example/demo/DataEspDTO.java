package com.example.demo;


import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DataEspDTO implements Serializable{

	private static final long serialVersionUID = -1009181914538808960L;
	double value;
}
