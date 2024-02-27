package com.example.OpsDailyCheck.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;


/**
 * An OpsDailyCheck.
 */
@Entity
@Table(name = "ops_daily_check")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class OpsDailyCheck implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "planet_time_check")
    private Boolean planetTimeCheck;

    @Column(name = "fish_planet_product_check")
    private Boolean fishPlanetProductCheck;

    @Column(name = "offer_validity_check")
    private Boolean offerValidityCheck;

    @Column(name = "delivery_partner_check")
    private Boolean deliveryPartnerCheck;

    @Column(name = "order_check")
    private Boolean orderCheck;

    @Column(name = "merchant_delay_check")
    private Boolean merchantDelayCheck;

    @Column(name = "delivery_delay_check")
    private Boolean deliveryDelayCheck;

    @Column(name = "comment")
    private String comment;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "created_at")
    private Instant createdAt;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public OpsDailyCheck id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getPlanetTimeCheck() {
        return this.planetTimeCheck;
    }

    public OpsDailyCheck planetTimeCheck(Boolean planetTimeCheck) {
        this.setPlanetTimeCheck(planetTimeCheck);
        return this;
    }

    public void setPlanetTimeCheck(Boolean planetTimeCheck) {
        this.planetTimeCheck = planetTimeCheck;
    }

    public Boolean getFishPlanetProductCheck() {
        return this.fishPlanetProductCheck;
    }

    public OpsDailyCheck fishPlanetProductCheck(Boolean fishPlanetProductCheck) {
        this.setFishPlanetProductCheck(fishPlanetProductCheck);
        return this;
    }

    public void setFishPlanetProductCheck(Boolean fishPlanetProductCheck) {
        this.fishPlanetProductCheck = fishPlanetProductCheck;
    }

    public Boolean getOfferValidityCheck() {
        return this.offerValidityCheck;
    }

    public OpsDailyCheck offerValidityCheck(Boolean offerValidityCheck) {
        this.setOfferValidityCheck(offerValidityCheck);
        return this;
    }

    public void setOfferValidityCheck(Boolean offerValidityCheck) {
        this.offerValidityCheck = offerValidityCheck;
    }

    public Boolean getDeliveryPartnerCheck() {
        return this.deliveryPartnerCheck;
    }

    public OpsDailyCheck deliveryPartnerCheck(Boolean deliveryPartnerCheck) {
        this.setDeliveryPartnerCheck(deliveryPartnerCheck);
        return this;
    }

    public void setDeliveryPartnerCheck(Boolean deliveryPartnerCheck) {
        this.deliveryPartnerCheck = deliveryPartnerCheck;
    }

    public Boolean getOrderCheck() {
        return this.orderCheck;
    }

    public OpsDailyCheck orderCheck(Boolean orderCheck) {
        this.setOrderCheck(orderCheck);
        return this;
    }

    public void setOrderCheck(Boolean orderCheck) {
        this.orderCheck = orderCheck;
    }

    public Boolean getMerchantDelayCheck() {
        return this.merchantDelayCheck;
    }

    public OpsDailyCheck merchantDelayCheck(Boolean merchantDelayCheck) {
        this.setMerchantDelayCheck(merchantDelayCheck);
        return this;
    }

    public void setMerchantDelayCheck(Boolean merchantDelayCheck) {
        this.merchantDelayCheck = merchantDelayCheck;
    }

    public Boolean getDeliveryDelayCheck() {
        return this.deliveryDelayCheck;
    }

    public OpsDailyCheck deliveryDelayCheck(Boolean deliveryDelayCheck) {
        this.setDeliveryDelayCheck(deliveryDelayCheck);
        return this;
    }

    public void setDeliveryDelayCheck(Boolean deliveryDelayCheck) {
        this.deliveryDelayCheck = deliveryDelayCheck;
    }

    public String getComment() {
        return this.comment;
    }

    public OpsDailyCheck comment(String comment) {
        this.setComment(comment);
        return this;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public OpsDailyCheck createdBy(String createdBy) {
        this.setCreatedBy(createdBy);
        return this;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public OpsDailyCheck updatedBy(String updatedBy) {
        this.setUpdatedBy(updatedBy);
        return this;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public OpsDailyCheck updatedAt(Instant updatedAt) {
        this.setUpdatedAt(updatedAt);
        return this;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public OpsDailyCheck createdAt(Instant createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsDailyCheck)) {
            return false;
        }
        return id != null && id.equals(((OpsDailyCheck) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OpsDailyCheck{" +
                "id=" + getId() +
                ", planetTimeCheck='" + getPlanetTimeCheck() + "'" +
                ", fishPlanetProductCheck='" + getFishPlanetProductCheck() + "'" +
                ", offerValidityCheck='" + getOfferValidityCheck() + "'" +
                ", deliveryPartnerCheck='" + getDeliveryPartnerCheck() + "'" +
                ", orderCheck='" + getOrderCheck() + "'" +
                ", merchantDelayCheck='" + getMerchantDelayCheck() + "'" +
                ", deliveryDelayCheck='" + getDeliveryDelayCheck() + "'" +
                ", comment='" + getComment() + "'" +
                ", createdBy='" + getCreatedBy() + "'" +
                ", updatedBy='" + getUpdatedBy() + "'" +
                ", updatedAt='" + getUpdatedAt() + "'" +
                ", createdAt='" + getCreatedAt() + "'" +
                "}";
    }
}
