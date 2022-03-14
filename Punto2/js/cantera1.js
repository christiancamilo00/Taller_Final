const main = () => {
    const elements = document.querySelectorAll(".fruta");
    const cambiar = document.querySelector("#cambiar")

    cambiar.addEventListener('click', () => {

        elements.forEach(element => {
            console.log(element.classList.contains('even'));
            if (element.classList.contains('even')) {
                element.classList.remove('even');
                element.classList.add('odd')
            } else {
                element.classList.remove('odd');
                element.classList.add('even');

            }


        })
    })
}