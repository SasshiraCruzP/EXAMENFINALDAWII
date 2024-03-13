package com.examenfinal.finaldswii.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examenfinal.finaldswii.model.Ticket;
import com.examenfinal.finaldswii.repo.TicketRepo;
import com.examenfinal.finaldswii.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
    private TicketRepo ticketRepo;


	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub		
		return  ticketRepo.findAll();
	}

	@Override
	public Ticket getTicketById(int id) {
		// TODO Auto-generated method stub
		return ticketRepo.findById(id).orElse(null);
	}

	@Override
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketRepo.save(ticket);
	}

	@Override
	public Ticket updateTicket(int id, Ticket newTicket) {
      //Validacion si el Id existe proporcionado
	  Ticket ticketA = ticketRepo.findById(id).orElse(null);
        if (ticketA != null) {
            // Actualizar los datos del ticket existente con los nuevos datos
        	
        	ticketA.setTitle(newTicket.getTitle());
        	ticketA.setDescription(newTicket.getDescription());
        	ticketA.setKind(newTicket.getKind());
        	ticketA.setUser(newTicket.getUser());
        	ticketA.setAssigned(newTicket.getAssigned());
        	ticketA.setProject(newTicket.getProject());
        	ticketA.setCategory(newTicket.getCategory());
        	ticketA.setPriority(newTicket.getPriority());
        	ticketA.setStatus(newTicket.getStatus());
            return ticketRepo.save(ticketA);
        } else {
            return null;
        }
	}

	@Override
	public void deleteTicket(int id) {
		// TODO Auto-generated method stub
		ticketRepo.deleteById(id);
	}

	

}
