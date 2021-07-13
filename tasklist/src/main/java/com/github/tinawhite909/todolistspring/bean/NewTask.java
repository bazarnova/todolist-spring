package com.github.tinawhite909.todolistspring.bean;

import com.github.tinawhite909.todolistspring.users.bean.NewUser;

import java.time.LocalDate;

public class NewTask {
    private Long id;
    private LocalDate startDate;
    private LocalDate finishDate;
    private String content;
    private String status;
    private Long id_Status;
    private NewUser assigner;
    private NewUser assigned_to;

    public NewTask(Builder builder) {
        this.id = builder.id;
        this.startDate = builder.startDate;
        this.finishDate = builder.finishDate;
        this.content = builder.content;
        this.status = builder.status;
        this.id_Status = builder.id_Status;
        this.assigner = builder.assigner;
        this.assigned_to = builder.assigned_to;
    }

    public NewTask() {
    }

    public NewTask(Long id, LocalDate startDate, LocalDate finishDate, String content, String status, Long id_Status, NewUser assigner, NewUser assigned_to) {
        this.id = id;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.content = content;
        this.status = status;
        this.id_Status = id_Status;
        this.assigner = assigner;
        this.assigned_to = assigned_to;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getIdStatus() {
        return id_Status;
    }

    public void setIdStatus(Long id_Status) {
        this.id_Status = id_Status;
    }

    public NewUser getAssigner() {
        return assigner;
    }

    public void setAssigner(NewUser assigner) {
        this.assigner = assigner;
    }

    public NewUser getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(NewUser assigned_to) {
        this.assigned_to = assigned_to;
    }

    public static class Builder {
        Long id;
        LocalDate startDate;
        LocalDate finishDate;
        String content;
        String status;
        Long id_Status;
        NewUser assigner;
        NewUser assigned_to;

        public NewTask.Builder setId(Long val) {
            id = val;
            return this;
        }

        public NewTask.Builder setStartDate(LocalDate date) {
            startDate = date;
            return this;
        }

        public NewTask.Builder setFinishDate(LocalDate date) {
            finishDate = date;
            return this;
        }

        public NewTask.Builder setContent(String task) {
            content = task;
            return this;
        }

        public NewTask.Builder setStatus(String stat) {
            status = stat;
            return this;
        }

        public NewTask.Builder setIdStatus(Long idStatus) {
            id_Status = idStatus;
            return this;
        }

        public NewTask.Builder setAssigner(NewUser assigner1) {
            assigner = assigner1;
            return this;
        }

        public NewTask.Builder setAssigned_to(NewUser perf) {
            assigned_to = perf;
            return this;
        }

        public NewTask build() {
            return new NewTask(this);
        }

    }
}