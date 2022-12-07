package uz.pdp.blogpost.backend.domains;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Comment extends BaseDomain {

	@NonNull
	private String message;

	@NonNull

	private String postId;





	@Builder(builderMethodName = "childBuilder")
	public Comment(@NonNull String id, boolean deleted, LocalDateTime createdAt, LocalDateTime updateAt, @NonNull String createdBy, String updatedBy, @NonNull String message, @NonNull String postId) {
		super(id, deleted, createdAt, updateAt, createdBy, updatedBy);
		this.message = message;
		this.postId = postId;
	}
}
