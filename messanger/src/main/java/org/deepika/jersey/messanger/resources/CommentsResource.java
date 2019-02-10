package org.deepika.jersey.messanger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
@Path("/")
public class CommentsResource {
	@GET
	@Path("{commentId}")
	public String getComments(@PathParam("messageId") String messageId, @PathParam("commentId") String commentId) {
		return "messageId:" + messageId + ",commentId:" + commentId;
	}
}
