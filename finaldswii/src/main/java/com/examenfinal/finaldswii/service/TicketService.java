package com.examenfinal.finaldswii.service;

import java.util.List;

import com.examenfinal.finaldswii.model.Ticket;

public interface TicketService {
	
	List<Ticket> getAllTickets();
	
    Ticket getTicketById(int id);
    
    Ticket createTicket(Ticket ticket);
    
    Ticket updateTicket(int id, Ticket newTicketData);
    
    void deleteTicket(int id);

}
