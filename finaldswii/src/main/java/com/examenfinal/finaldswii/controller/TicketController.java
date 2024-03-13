package com.examenfinal.finaldswii.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examenfinal.finaldswii.model.Ticket;
import com.examenfinal.finaldswii.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {
	
	    @Autowired
	    private TicketService ticketService;

	    @GetMapping
	    public List<Ticket> getAllTickets() {
	        return ticketService.getAllTickets();
	    }

	    @PostMapping
	    public Ticket createTicket(@RequestBody Ticket ticket) {
	        return ticketService.createTicket(ticket);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Ticket> getTicketById(@PathVariable int id) {
	        Ticket ticket = ticketService.getTicketById(id);
	        if (ticket != null) {
	            return ResponseEntity.ok(ticket);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Ticket> updateTicket(@PathVariable int id, @RequestBody Ticket ticket) {
	        Ticket updatedTicket = ticketService.updateTicket(id, ticket);
	        if (updatedTicket != null) {
	            return ResponseEntity.ok(updatedTicket);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteTicket(@PathVariable int id) {
	        ticketService.deleteTicket(id);
	        return ResponseEntity.noContent().build();
	    }
}
