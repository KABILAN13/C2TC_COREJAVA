// src/App.js
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import OrderList from './OrderList';
import OrderForm from './OrderForm';
import './App.css';
import './OrderForm.css';
import './OrderList.css';
import './index.css';

const App = () => {
  const [orders, setOrders] = useState([]);

  useEffect(() => {
    fetchOrders();
  }, []);

  const fetchOrders = async () => {
    try {
      const response = await axios.get('http://localhost:8080/orders');
      setOrders(response.data);
    } catch (error) {
      console.error('Error fetching orders:', error);
    }
  };

  const addOrder = async (order) => {
    try {
      const response = await axios.post('http://localhost:8080/orders', order);
      const newOrder = response.data;
      console.log('New order received from API:', newOrder); // Log the new order
      setOrders([...orders, newOrder]);
      console.log('Orders after addition:', orders); // Log updated orders
    } catch (error) {
      console.error('Error adding order:', error);
    }
  };
  
  

  const removeOrder = async (orderToRemove) => {
    try {
      await axios.delete(`http://localhost:8080/orders/${orderToRemove.id}`);
      setOrders(orders.filter(order => order.id !== orderToRemove.id));
    } catch (error) {
      console.error('Error removing order:', error);
    }
  };

  return (
    <div className="app">
      <h1>Order Management</h1>
      <OrderForm addOrder={addOrder} />
      <OrderList orders={orders} removeOrder={removeOrder} />
    </div>
  );
};

export default App;


  
