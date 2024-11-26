package com.challenge.event_system.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "TB_BLOCK")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start", columnDefinition = "TIMESTAMP")
    private Instant start;

    @Column(columnDefinition = "TIMESTAMP")
    private Instant end_time;

    public Block() {}

    public Block(Integer id, Instant start, Instant end) {
        this.id = id;
        this.start = start;
        this.end_time = end;
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

    public Instant getEnd() {
        return end_time;
    }

    public void setEnd(Instant end) {
        this.end_time = end;
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
