package com.mysite.community.member;

import com.mysite.community.comments.Comments;
import com.mysite.community.common.CommonEntity;
import com.mysite.community.posting.Posting;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Setter
public class Member extends CommonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "member_seq")
  private Integer id;

  @NotNull
  private String name;

  @NotNull
  private String email;

  @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
  private List<Posting> postingList;

  @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
  private List<Comments> commentsList;
}
