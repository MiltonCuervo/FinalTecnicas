document.addEventListener('DOMContentLoaded', function() {
    var products = document.querySelectorAll('.product');
    products.forEach(function(product, index) {
        product.style.animationDelay = (index * 0.1) + 's';
        product.style.animationName = 'fadeIn';
    });
});

