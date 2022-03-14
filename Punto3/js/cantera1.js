const main = () => {
    let element = document.querySelector("#estilo1");
    console.log(element);

    let element2 = document.getElementById("estilo2");
    console.log(element2);

    let btnEjecutar = document.querySelector("#btnEjecutar");
    btnEjecutar.addEventListener("click", ejecutar);
}

const cambiarColor = (id) => {
    let element = document.querySelector(`#${id}`);
    element.classList.add("estilo2");
}

const removerEstilo = (id, estilo) => {
    let element = document.querySelector(`#${id}`);
    element.classList.remove(estilo);
}

const ejecutar = () => {
    let element = document.querySelector(`#slcOpciones`);
    let parrafo = document.querySelector(`#estilo2`);
    switch (Number(element.value)) {
        case 1:
            parrafo.classList.add("estilo6");
            break;
        case 2:
            parrafo.classList.remove("estilo2");
            break;
        case 3:
            parrafo.classList.add("estilo7");
            break;
        default:
            console.log(element.value);
    }
}