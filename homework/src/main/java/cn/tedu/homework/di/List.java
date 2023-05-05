package cn.tedu.homework.di;

public class List {
    private Integer id;
    private Integer status;
    private String receiver;
    private String address;
    private String comment;

    public List() {

    }

    public List(Integer id, Integer status, String receiver, String address, String comment) {
        this.id = id;
        this.status = status;
        this.receiver = receiver;
        this.address = address;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", status=" + status +
                ", receiver='" + receiver + '\'' +
                ", address='" + address + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
