package com.project.designpatterns.service;

import com.project.designpatterns.dao.OrderDAO;
import com.project.designpatterns.objectMappers.OrderMapper;
import com.project.designpatterns.pojos.OrderRequest;
import org.springframework.stereotype.Service;

@Service("STORE")
public class StoreOrderServiceImpl implements OrderService {


    private final OrderDAO orderDAO;

    public StoreOrderServiceImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public Long processOrder(OrderRequest order) {
        try {
            return orderDAO.saveOrder(OrderMapper.convertToOrderEntity(order)).getId();
        } catch (Exception ex) {
            return (long) -2;
        }
    }

    @Override
    public String getType(String type) {
        return "STORE";
    }
}
