package uz.pdp.blogpost.backend.domains;


import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class User extends BaseDomain{




	@NonNull
	private String fullName;

	@NonNull
	private String username;

	@NonNull
	private String password;

	private Status status=Status.NOT_ACTIVE;

	private AuthRole authRole=AuthRole.USER;

	private Language language=Language.RU;




	public  enum Status{

		ACTIVE(0),
		NOT_ACTIVE(-1),

		BLOCKED(-50),

		BANNED(-100);

		private final int level;


		Status(int level) {
			this.level = level;
		}

		public int getLevel() {
			return level;
		}
	}

	public  enum AuthRole{

      ADMIN, USER;

	}

	public enum Language{
		UZ,
		RU, EN;
	}


	@Builder(builderMethodName = "childBuilder")
	public User(@NonNull String id, boolean deleted, LocalDateTime createdAt, LocalDateTime updateAt, @NonNull String createdBy, String updatedBy, @NonNull String fullName, @NonNull String username, @NonNull String password, Status status, AuthRole authRole, Language language) {
		super(id, deleted, createdAt, updateAt, createdBy, updatedBy);
		this.fullName = fullName;
		this.username = username;
		this.password = password;
		this.status = status;
		this.authRole = authRole;
		this.language = language;
	}

}
