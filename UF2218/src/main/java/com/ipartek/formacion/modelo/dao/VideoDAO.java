package com.ipartek.formacion.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.model.ConnectionManager;
import com.ipartek.formacion.model.pojo.Video;

public class VideoDAO {
		
	private static VideoDAO INSTANCE = null;

	private VideoDAO() {
		super();
	}

	public static VideoDAO getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new VideoDAO();
		}
		return INSTANCE;
	}

	public ArrayList<Video> getAll() {
		
		ArrayList<Video> lista = new ArrayList<Video>();
		String sql = "SELECT `id`, `nombre`, `codigo` FROM `video` ORDER BY `id` DESC LIMIT 500";

		try (Connection con = ConnectionManager.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()) {

			while (rs.next()) {
				Video v = new Video();
				v.setId( rs.getInt("id") );
				v.setNombre( rs.getString("nombre"));
				v.setCodigo( rs.getString("codigo"));
				lista.add(v);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return lista;
	}
/*
	@Override
	public Rol getById(int id) {
		Rol rol = new Rol();
		String sql = "SELECT `id`, `nombre` FROM `rol` WHERE `id` = ?;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setInt(1, id);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					rol = mapper(rs);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rol;
	}
	public ArrayList<Rol> getByName(String search) {
		ArrayList<Rol> lista = new ArrayList<Rol>();
		String sql = "SELECT id, nombre FROM rol WHERE nombre LIKE ? ORDER BY id DESC LIMIT 500;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, "%" + search + "%");
			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					lista.add(mapper(rs));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	@Override
	public boolean save(Rol pojo) throws SQLException {
		boolean resultado = false;
		if (pojo != null) {
			// Sanitize nombre
			pojo.setNombre(Utilidades.limpiarEspacios(pojo.getNombre()));
			if (pojo.getId() == -1) {
				resultado = crear(pojo);
			} else {
				resultado = modificar(pojo);
			}
		}
		return resultado;
	}
	private boolean modificar(Rol pojo) throws MysqlDataTruncation, MySQLIntegrityConstraintViolationException {
		boolean resultado = false;
		String sql = "UPDATE `nidea`.`rol` SET `nombre`= ? WHERE  `id`= ?;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, pojo.getNombre());
			pst.setInt(2, pojo.getId());
			resultado = doSave(pst, pojo);
		} catch (MySQLIntegrityConstraintViolationException e) {
			System.out.println("Rol duplicado");
			throw e;
		} catch (MysqlDataTruncation e) {
			System.out.println("Nombre muy largo");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	private boolean crear(Rol pojo) throws MySQLIntegrityConstraintViolationException, MysqlDataTruncation {
		boolean resultado = false;
		String sql = "INSERT INTO `nidea`.`rol` (`nombre`) VALUES (?);";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, pojo.getNombre());
			resultado = doSave(pst, pojo);
		} catch (MySQLIntegrityConstraintViolationException e) {
			System.out.println("Rol duplicado");
			throw e;
		} catch (MysqlDataTruncation e) {
			System.out.println("Nombre muy largo");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	private boolean doSave(PreparedStatement pst, Rol pojo)
			throws MySQLIntegrityConstraintViolationException, MysqlDataTruncation {
		boolean resultado = false;
		try {
			int affectedRows = pst.executeUpdate();
			if (affectedRows == 1) {
				try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						pojo.setId(generatedKeys.getInt(1));
					}
				}
				resultado = true;
			}
		} catch (MySQLIntegrityConstraintViolationException e) {
			System.out.println("Rol duplicado");
			throw e;
		} catch (MysqlDataTruncation e) {
			System.out.println("Nombre muy largo");
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	@Override
	public boolean delete(int id) {
		boolean resultado = false;
		String sql = "DELETE FROM `rol` WHERE  `id`= ?;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql);) {
			pst.setInt(1, id);
			int affetedRows = pst.executeUpdate();
			if (affetedRows == 1) {
				resultado = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	@Override
	public Rol mapper(ResultSet rs) throws SQLException {
		Rol rol = new Rol();
		rol.setId(rs.getInt("id"));
		rol.setNombre(rs.getString("nombre"));
		return rol;
	}
*/

	public Video getById(int id) {
		Video video = new Video();
		String sql = "SELECT `id`, `nombre` , `codigo` FROM `video` WHERE `id` = ?;";
		try (Connection con = ConnectionManager.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setInt(1, id);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					video = mapper(rs);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return video;
	}
	
	public Video mapper(ResultSet rs) throws SQLException {
		Video v = new Video();
		v.setId( rs.getInt("id") );
		v.setNombre( rs.getString("nombre"));
		v.setCodigo( rs.getString("codigo"));
		return v;
	}
	
	
}