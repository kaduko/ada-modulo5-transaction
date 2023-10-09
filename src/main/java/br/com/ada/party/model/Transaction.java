package br.com.ada.party.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Transaction {
	
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private LocalDate date;
    private String Description;

}
