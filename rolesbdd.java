/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.octest.bdd;


import com.octest.Beans.roles;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP
 */
public class rolesbdd {
    
    private Connection connexion;
    
    public List<roles> recupererRoles() {
        List<roles> roles = new ArrayList<roles>();
        Statement statement = null;
        ResultSet resultat = null;

        loadDatabase();
        
        try {
            statement = connexion.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT name, description FROM roles;");

            // Récupération des données
            while (resultat.next()) {
                String name = resultat.getString("name");
                String description = resultat.getString("description");
               
                //inlure com.octest.Beans--roles
                roles role = new roles();
                role.setName(name);
                role.setDescription(description);
                
                roles.add(role);
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return roles;
    }
    
     private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost/ikewiki", "ikewiki", "s3cr3t");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    //com.octest.Beans
    public void ajouterRoles(roles role) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO roles(name, description) VALUES(?, ?);");
            preparedStatement.setString(1, role.getName());
            preparedStatement.setString(2, role.getDescription());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public roles getRoleById(Integer id) {
		try {
			roles role = new roles();
			//Connection connection = CONNECTION.getConnection();
			PreparedStatement ps = connexion.prepareStatement("select * from roles where id = ?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				role.setId(rs.getInt("id"));
				role.setName(rs.getString("name"));
                                role.setDescription(rs.getString("description"));		
			}
			
			return role;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
    
    public Boolean editRole(roles role) {
		loadDatabase();
		try {
			String sql = "update `roles` set name = ?, description = ? where id = ? ;";
			PreparedStatement ps = connexion.prepareStatement(sql);
                        ps.setInt(1,role.getId());
			ps.setString(2, role.getName());
			ps.setString(3, role.getDescription());			
			ps.executeUpdate();			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
    
    public Boolean delRole (roles role) {
        
		try {
			String sql = "delete from `contacts` where id = ?";
			PreparedStatement ps = connexion.prepareStatement(sql);
			ps.setInt(1, role.getId());
			ps.execute();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
    
    
    
    
    
    
    
   
    
    
}
