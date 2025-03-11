// src/components/OrderForm.js
import React, { useState } from 'react';

const OrderForm = ({ addOrder }) => {
  const [customerName, setCustomerName] = useState('');
  const [orderDate, setOrderDate] = useState(new Date().toISOString().slice(0, 16)); // Default to now
  const [status, setStatus] = useState('Pending');

  const handleSubmit = (e) => {
    e.preventDefault();
    const newOrder = {
      customerName,
      orderDate,
      status,
    };
    addOrder(newOrder);
    setCustomerName('');
    setOrderDate(new Date().toISOString().slice(0, 16));
    setStatus('Pending');
  };

  return (
    <form onSubmit={handleSubmit} className="order-form">
      <h2>Place an Order</h2>
      <div>
        <label>
          Name:
          <input
            type="text"
            value={customerName}
            onChange={(e) => setCustomerName(e.target.value)}
            required
          />
        </label>
      </div>
      <div>
        <label>
          Order Date:
          <input
            type="datetime-local"
            value={orderDate}
            onChange={(e) => setOrderDate(e.target.value)}
            required
          />
        </label>
      </div>
      <div>
        <label>
          Status:
          <select
            value={status}
            onChange={(e) => setStatus(e.target.value)}
          >
            <option value="Pending">Pending</option>
            <option value="Completed">Completed</option>
            <option value="Cancelled">Cancelled</option>
          </select>
        </label>
      </div>
      <button type="submit">Submit Order</button>
    </form>
  );
};

export default OrderForm;