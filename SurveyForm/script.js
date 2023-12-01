function submitForm(){
    event.preventDefault();
}

if(!validateForm()){
   return;
}

const formData = {
    'First Name' : document.getElementById('firstName').value,
    'Last Name' : document.getElementById('lastName').value,
    'Date of Birth' : document.getElementById('dob').value,
    'Country' : document.getElementById('country').value,
    'Gender': document.getElementById('gender').value,
    'Profession': document.getElementById('profession').value,
    'Email': document.getElementById('email').value,
    'Mobile Number': document.getElementById('mobile').value,
};

let popupContent = '<h2>Survey From Data</h2>';
for(const[label, value] of Object.entries(formData)){
    popupContent += '<p><strong>${label}:</strong> ${value}</p2>';
}

const popup = window.open('', 'Survey Data' , 'width=400,height=400');
popup.document.body.innerHTML = popupContent;

// reset the form
document.getElementById('surveyForm').reset();


function validateForm(){
   const form = document.getElementById('surveyForm');
   return form.checkValidity();
}

function getSelectedCheckboxes(name){
    const checkboxes = document.querySelectorAll('input[name="${name}"]:checked');
    return Array.from(checkboxes).map(checkbox => checkbox.value);
}

