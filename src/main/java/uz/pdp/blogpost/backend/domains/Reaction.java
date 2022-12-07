package uz.pdp.blogpost.backend.domains;


import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Reaction extends BaseDomain{

	@NonNull
	private boolean like=true;


	@NonNull
	private String postId;

	@Builder(builderMethodName = "childBuilder")
	public Reaction(@NonNull String id, boolean deleted, LocalDateTime createdAt, LocalDateTime updateAt, @NonNull String createdBy, String updatedBy, @NonNull boolean like, @NonNull String postId) {
		super(id, deleted, createdAt, updateAt, createdBy, updatedBy);
		this.like = like;
		this.postId = postId;
	}

}
