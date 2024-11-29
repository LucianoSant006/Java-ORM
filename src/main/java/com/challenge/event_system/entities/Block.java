package com.challenge.event_system.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TB_BLOCK")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start_time", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start;


    @Column(name = "end_time",columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant end;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activities;
    public Block() {}

    public Block(Integer id, Instant start, Instant end_time, Activity activities) {
        this.id = id;
        this.start = start;
        this.end = end_time;
        this.activities = activities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd_time() {
        return end;
    }

    public void setEnd_time(Instant end_time) {
        this.end = end_time;
    }

    public Activity getActivities() {
        return activities;
    }

    public void setActivities(Activity activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return Objects.equals(id, block.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
