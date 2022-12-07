package uz.pdp.blogpost.backend.domains;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Post  extends BaseDomain{

	@NonNull
	private String title;

	@NonNull
	private String overview;

	@NonNull
	private String content;

	@Builder(builderMethodName = "childBuilder")
	public Post(@NonNull String id, boolean deleted, LocalDateTime createdAt, LocalDateTime updateAt, @NonNull String createdBy, String updatedBy, @NonNull String title, @NonNull String overview, @NonNull String content) {
		super(id, deleted, createdAt, updateAt, createdBy, updatedBy);
		this.title = title;
		this.overview = overview;
		this.content = content;
	}
}
