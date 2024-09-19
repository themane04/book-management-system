package ch.iet_gibb.media.model;

import java.util.Date;

public class RentHistoryItem {
    private Date rentedAt;
    private Date givenBackAt;
    protected String rentedBy;

    RentHistoryItem(Date RentedAt, Date GivenBackAt, String RentedBy) {
        SetRentedAt(RentedAt);
        SetGivenBackAt(GivenBackAt);
        rentedBy = RentedBy;
    }

    private  void SetRentedAt(Date RentedAt) {
        Date today = new Date();
        if (today.getDate() <= RentedAt.getDate()) {
            rentedAt = RentedAt;
        }
    }

    public void SetGivenBackAt(Date GivenBackAt) {
        Date today = new Date();
        if (today.getDate() <= GivenBackAt.getDate()) {
            givenBackAt = GivenBackAt;
        }
    }

    public Date GetRentedAt() {
        return rentedAt;
    }

    public Date GetGivenBackAt() {
        return givenBackAt;
    }
}
