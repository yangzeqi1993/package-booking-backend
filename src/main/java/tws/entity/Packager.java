package tws.entity;

public class Packager {
    private String id;
    private String receiver;
    private String phone;
    private String weight;
    private String status;
    private String appointment;

    public Packager(){}

    public Packager(String id, String receiver, String phone, String weight, String status) {
        this.id = id;
        this.receiver = receiver;
        this.phone = phone;
        this.weight = weight;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
