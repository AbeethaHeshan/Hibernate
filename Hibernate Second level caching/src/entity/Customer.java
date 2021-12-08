package entity;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
    @Entity(name = "customer_detail")
    @Cacheable
    @org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    public class Customer {
        @Id
        private
        String id;
        private String name;
        private String address;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }


        public Customer(String id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        public Customer() {
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
