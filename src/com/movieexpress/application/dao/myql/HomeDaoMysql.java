package com.movieexpress.application.dao.myql;

import java.util.ArrayList;
import java.util.List;

import com.moiveexpress.common.BaseDao;
import com.movieexpress.application.dto.Movie;


public class HomeDaoMysql extends BaseDao {

	public List<Movie> getMovies(int number) throws Exception {
		List<Movie> movies = new ArrayList<Movie>();

		query = "select a.id, a.title,a.description, a.small_image , a.release_date  from movie a"
				+ " join rating b order by b.rate DESC LIMIT ?";

		try {
			connect();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, number);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Movie movie = new Movie();
				movie.setId(resultSet.getInt("id"));
				movie.setTitle(resultSet.getString("title"));
				movie.setDescription(resultSet.getString("description"));
				movie.setSmall_image(resultSet.getString("small_image"));
				movie.setRelease_date(resultSet.getDate("release_date"));
				// contact.toString();
				movies.add(movie);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			close();
		}

		return movies;

	}

	// public List getContacts(User user) throws Exception {
	// List contacts = new ArrayList();
	// query = "Select * from contact where user_id=?";
	//
	// try {
	// connect();
	// preparedStatement = connection.prepareStatement(query);
	// preparedStatement.setInt(1, user.getId());
	// resultSet = preparedStatement.executeQuery();
	//
	// while (resultSet.next()) {
	// Contact contact = new Contact();
	// contact.setId(resultSet.getInt("id"));
	// contact.setFirstName(resultSet.getString("first_name"));
	// contact.setMiddleName(resultSet.getString("middle_name"));
	// contact.setLastName(resultSet.getString("last_name"));
	// contact.setPhone(resultSet.getString("phone"));
	// contact.setAddress(resultSet.getString("address"));
	// contact.setUserId(resultSet.getInt("user_id"));
	// contact.toString();
	// contacts.add(contact);
	// }
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw e;
	// } finally {
	// close();
	// }
	//
	// return contacts;
	// }
	//
	// public List searchContacts(User user, String search) throws Exception {
	// List contacts = new ArrayList();
	// query =
	// "Select * from contact where user_id=? and (first_name like ? or middle_name like ? or last_name like ? or address like ? or phone like ?)";
	//
	// try {
	// connect();
	// preparedStatement = connection.prepareStatement(query);
	// preparedStatement.setInt(1, user.getId());
	// preparedStatement.setString(2, "%" + search + "%");
	// preparedStatement.setString(3, "%" + search + "%");
	// preparedStatement.setString(4, "%" + search + "%");
	// preparedStatement.setString(5, "%" + search + "%");
	// preparedStatement.setString(6, "%" + search + "%");
	//
	// System.out.println(preparedStatement);
	//
	// resultSet = preparedStatement.executeQuery();
	//
	// while (resultSet.next()) {
	// Contact contact = new Contact();
	// contact.setId(resultSet.getInt("id"));
	// contact.setFirstName(resultSet.getString("first_name"));
	// contact.setMiddleName(resultSet.getString("middle_name"));
	// contact.setLastName(resultSet.getString("last_name"));
	// contact.setPhone(resultSet.getString("phone"));
	// contact.setAddress(resultSet.getString("address"));
	// contact.setUserId(resultSet.getInt("user_id"));
	// contact.toString();
	// contacts.add(contact);
	// }
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	// throw e;
	// } finally {
	// close();
	// }
	//
	// return contacts;
	// }
}