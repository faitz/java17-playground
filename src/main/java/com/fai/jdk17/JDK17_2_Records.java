package com.fai.jdk17;

import java.util.Objects;
import java.util.StringJoiner;

public class JDK17_2_Records {

    public static void main(String[] args) {
        CustomerRecord cr = new CustomerRecord("John", "Sky");
        Customer c = new Customer("john", "Sky");
    }

    public record CustomerRecord(String name, String address) {}

    public static class Customer{
        private String name;
        private String address;

        public Customer(String name, String address) {
            this.name = name;
            this.address = address;
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

        @Override
        public String toString() {
            return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                    .add("name='" + name + "'")
                    .add("address='" + address + "'")
                    .toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Customer)) return false;
            Customer customer = (Customer) o;
            return Objects.equals(getName(), customer.getName()) && Objects.equals(getAddress(), customer.getAddress());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAddress());
        }
    }
}

