package com.commerce_04.commerce.web.dto.wishlist;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteWishlistRequest {

	private String userId;
	private Long productId;
	private Long wishlistId;
}
