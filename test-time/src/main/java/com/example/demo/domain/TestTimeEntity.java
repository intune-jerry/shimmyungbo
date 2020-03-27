package com.example.demo.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="Time")
@Table(name="time_test")
public class TestTimeEntity {
	
	@Id
	@Column(name = "time_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int timeNo;
	
	@Column(name ="name")
	private String name;
	
	@Column(name="update_time")
	private LocalDateTime updateTime;

}
