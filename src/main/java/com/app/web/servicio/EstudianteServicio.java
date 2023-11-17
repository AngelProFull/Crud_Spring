package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;

public interface EstudianteServicio {

	public List<Estudiante> listarTodosLosEstudiantes();
	
	//Método para guardar los datos del formulario.
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long id);
	
	public Estudiante acturalizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id);
}
