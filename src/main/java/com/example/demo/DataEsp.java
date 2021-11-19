package com.example.demo;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "tb_esp")
public class DataEsp implements Serializable{

	private static final long serialVersionUID = -4602712364612132123L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	double value;
	LocalDateTime time;
	
	public DataEsp(DataEspDTO dto) {
		this.value = dto.getValue();
		this.time = LocalDateTime.now();
	}

}
