package org.example.escuela;

import java.util.ArrayList;

public class EscuelaImpl implements Escuela {
	ArrayList<AlumnoRequest> Alumnos= new ArrayList<AlumnoRequest>();
	ArrayList<AsignaturaRequest> Asignaturas = new ArrayList<AsignaturaRequest>();
	ArrayList<EvaluacionRequest >Evaluaciones= new ArrayList<EvaluacionRequest >();
	@Override
	public AsignaturaResponse asignaturaAlumno(AsignaturaRequest parameters) {
		// TODO Auto-generated method stub
		AsignaturaRequest request = new AsignaturaRequest();
		AsignaturaResponse response = new AsignaturaResponse();
		request.setIdasignatura(parameters.getIdasignatura());
		request.setNameasignatura(parameters.getNameasignatura());
		for(int f=0;f<Asignaturas.size();f++) {
			if(Asignaturas.get(f).getIdasignatura().equals(request.getIdasignatura())) {
				response.setGreet("Asignatura no dada de alta");
				return response;
			}
		}
		Asignaturas.add(request);
		response.setGreet("Asignatura dada de alta");
		return response;
	}

	@Override
	public EvaluacionResponse evaluacionEscuela(EvaluacionRequest parameters) {
		// TODO Auto-generated method stub
		EvaluacionRequest request=new EvaluacionRequest();
		EvaluacionResponse response=new EvaluacionResponse();
		for(int f=0;f<Alumnos.size();f++) {
			if (Alumnos.get(f).getId().equals(request.getNombre())) {
				request.setNombre(parameters.getNombre());
			}
		}

		for(int f=0;f<Asignaturas.size();f++) {
			if (Asignaturas.get(f).getIdasignatura().equals(request.getAsignatura())) {
				request.setAsignatura(parameters.getAsignatura());
			}
		}

		request.setNota(parameters.getNota());	



		Evaluaciones.add(request);
		response.setGreet("Nota registrada");
		return response;
	}


	@Override
	public AlumnoResponse escuelaAlumno(AlumnoRequest parameters) {
		// TODO Auto-generated method stub
		AlumnoRequest request =new AlumnoRequest();
		AlumnoResponse response=new AlumnoResponse();
		request.setDireccion(parameters.getDireccion());
		request.setId(parameters.getId());
		request.setNombre(parameters.getNombre());
		for(int f=0;f<Alumnos.size();f++) {
			if(Alumnos.get(f).getId().equals(request.getId())) {
				response.setGreet("Alumno no dado de alta");
				return response;
			}
		}		
		Alumnos.add(request);
		response.setGreet("Alumno dado de alta");
		return response;

	}

}

