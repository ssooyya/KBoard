package com.lec.spring.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class QryCommentList extends QryResult{
    @ToString.Exclude
    @JsonProperty("data")   //JSON변환시 "data"란 이름의 property로 변환됨.
    List<Comment> list;


}
