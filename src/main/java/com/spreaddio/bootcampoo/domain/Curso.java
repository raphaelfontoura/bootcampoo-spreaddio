package com.spreaddio.bootcampoo.domain;

public class Curso {
  private String titulo;
  private String descricao;
  private int cargaHoraria;

  public Curso(){ }

  public Curso(String titulo, String descricao, int cargaHoraria) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.cargaHoraria = cargaHoraria;
  }

  public String getTitulo() {
    return titulo;
  }
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public int getCargaHoraria() {
    return cargaHoraria;
  }
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cargaHoraria;
    result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Curso other = (Curso) obj;
    if (cargaHoraria != other.cargaHoraria)
      return false;
    if (titulo == null) {
      if (other.titulo != null)
        return false;
    } else if (!titulo.equals(other.titulo))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Curso [cargaHoraria=" + cargaHoraria + ", descricao=" + descricao + ", titulo=" + titulo + "]";
  }

  
}
