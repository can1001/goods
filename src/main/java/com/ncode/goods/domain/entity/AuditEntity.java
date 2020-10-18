package com.ncode.goods.domain.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AuditEntity implements Serializable {
    private static final long serialVersionUID = 3260746913487284618L;

    @Column(updatable = false)
    @CreatedDate
    protected LocalDateTime createdAt;

    @Column(updatable = false)
    @CreatedBy
    protected String createdBy;

    @LastModifiedDate
    protected LocalDateTime modifiedAt;

    @LastModifiedBy
    protected String modifiedBy;
}
