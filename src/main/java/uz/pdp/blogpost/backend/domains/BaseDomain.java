package uz.pdp.blogpost.backend.domains;

import lombok.*;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BaseDomain implements Entity{

	@NonNull
	private String id;

	private boolean deleted;

	private LocalDateTime createdAt=LocalDateTime.now(Clock.system(ZoneId.of("Asia/Tashkent")));

	private LocalDateTime updateAt;

	@NonNull
	private String createdBy;
	private String updatedBy;


}
