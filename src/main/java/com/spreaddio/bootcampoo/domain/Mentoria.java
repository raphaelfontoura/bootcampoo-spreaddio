package com.spreaddio.bootcampoo.domain;

import java.time.LocalDate;

public class Mentoria {
  private String titulo;
  private String descricao;
  private LocalDate data;
  
  public Mentoria() {
  }

  public Mentoria(String titulo, String descricao, LocalDate data) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.data = data;
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

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
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
    Mentoria other = (Mentoria) obj;
    if (titulo == null) {
      if (other.titulo != null)
        return false;
    } else if (!titulo.equals(other.titulo))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Mentoria [data=" + data + ", descricao=" + descricao + ", titulo=" + titulo + "]";
  }
  
}
