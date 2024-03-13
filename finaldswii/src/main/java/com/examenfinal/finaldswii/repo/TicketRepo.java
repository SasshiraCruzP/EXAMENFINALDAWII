package com.examenfinal.finaldswii.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examenfinal.finaldswii.model.Ticket;


public interface TicketRepo extends JpaRepository<Ticket, Integer> {

}
