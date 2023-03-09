package com.mysite.community.comments;


import com.mysite.community.common.CommonEntity;
import com.mysite.community.member.Member;
import com.mysite.community.posting.Posting;
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
public class Comments extends CommonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "comments_seq")
  private Integer id;

  @NotNull
  private String Content;

  @ManyToOne
  private Member member;

  @ManyToOne
  private Posting posting;
}
