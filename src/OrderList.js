// src/components/OrderList.js
import React from 'react';
function OrderList({ orders, removeOrder }) {
  return (
    <div>
      <h2>Order List</h2>
      {orders.length === 0 ? (
        <p>No orders yet.</p>
      ) : (
        <ul>
          {orders.map(order => (
            <li key={order.id}>
              <strong>Order ID:</strong> {order.id} |
              <strong>Name:</strong> {order.customerName} |
              <strong>Order Date:</strong> {new Date(order.orderDate).toLocaleString()} |
              <strong>Status:</strong> {order.status}
              <button onClick={() => removeOrder(order)}>Remove</button>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default OrderList;
