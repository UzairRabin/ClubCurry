package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Address;
import za.ac.cput.domain.CartMenuItems;
import za.ac.cput.repository.CartMenuItemsRepo;
import za.ac.cput.service.interfaces.ICartMenuItemsService;

import java.util.List;

@Service
public class CartMenuItemsService implements ICartMenuItemsService{
    private CartMenuItemsRepo cartMenuItemsRepo;

    @Autowired
    public CartMenuItemsService(CartMenuItemsRepo cartMenuItemsRepo) {
        this.cartMenuItemsRepo = cartMenuItemsRepo;
    }

    @Override
    public CartMenuItems save(CartMenuItems obj) {
        return cartMenuItemsRepo.save(obj);
    }

    @Override
    public CartMenuItems read(Long s) {
        return cartMenuItemsRepo.findById(s).orElse(null);
    }
}
