package com.mysite.community.posting;


import com.mysite.community.common.CommonEntity;
import com.mysite.community.member.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Setter
public class Posting extends CommonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "posting_seq")
  private Integer id;

  @NotNull
  private String name;

  @NotNull
  private String Content;

  @ManyToOne
  @NotNull
  private Member member;
}
